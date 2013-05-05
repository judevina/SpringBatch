/*
SQLyog Community v11.1 (32 bit)
MySQL - 5.5.27 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `ledger` (
	`id` int (11),
	`rcv_dt` date ,
	`mbr_nm` varchar (300),
	`chk_nbr` varchar (30),
	`chk_dt` date ,
	`pymt_typ` varchar (150),
	`dpst_amt` double ,
	`pymt_amt` double ,
	`comments` varchar (300)
); 
