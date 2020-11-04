package filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaders;

/**
 * @author Hout
 * @version 1.0
 */
public class AddNIOHeadFilter {

    public void filter(final FullHttpRequest fullRequest, final ChannelHandlerContext ctx) {
        HttpHeaders headers = fullRequest.headers();
        headers.add("nio", "huanghaote");
    }
}
