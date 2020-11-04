package inbound;

import filter.AddNIOHeadFilter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.FullHttpRequest;
import outbound.HttpOutboundHandler;

/**
 * @author Hout
 * @version 1.0
 */
public class HttpInboundHandler extends ChannelInboundHandlerAdapter {
    private String proxyServer;
    private HttpOutboundHandler httpOutboundHandler;
    private AddNIOHeadFilter addNIOHeadFilter;
    public HttpInboundHandler(String proxyServer) {
        this.proxyServer = proxyServer;
        httpOutboundHandler = new HttpOutboundHandler(proxyServer);
        addNIOHeadFilter = new AddNIOHeadFilter();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        FullHttpRequest httpRequest = (FullHttpRequest) msg;

        addNIOHeadFilter.filter(httpRequest, ctx);
        httpOutboundHandler.handle(httpRequest, ctx);
    }
}
