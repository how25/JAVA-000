DROP PROCEDURE IF EXISTS `getXY_scanManDay`;
delimiter ;;
CREATE PROCEDURE `getXY_scanManDay`(IN `start_date` date,
	IN `end_date` date,
	IN `alloc_org_id` bigint,
	IN `scanManCode` varchar(50),
	IN `scanKind` varchar(100),
	IN `pageNum` INT,
	IN `pageSize` INT)
BEGIN
 select `sum_date` sumDate,scan_kind scanKind,`scan_site_id` scanSiteId,scan_man_code scanManCode,`all_bill_cnt` allBillCnt,`all_weight` allWeight,`bag_cnt` bagCnt,`bag_weight` bagWeight,`inbag_cnt` inbagCnt
 from nebula_scan_man_sum_day
 where sum_date BETWEEN start_date and end_date
 AND CASE
	 WHEN !ISNULL(alloc_org_id)
	 THEN scan_site_id = alloc_org_id
	 ELSE 1=1
 END

 AND CASE
	 WHEN !ISNULL(scanManCode)
	 THEN scan_man_code = scanManCode
	 ELSE 1=1
 END

 AND CASE
	 WHEN !ISNULL(scanKind) && scanKind != 'null'
	 THEN FIND_IN_SET(scan_kind,scanKind)
	 ELSE 1=1
 END
 ORDER BY sum_date,scan_man_code
 limit pageNum,pageSize;
END
;;
delimiter ;