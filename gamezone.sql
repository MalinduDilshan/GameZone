-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 01, 2017 at 04:59 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gamezone`
--
CREATE DATABASE IF NOT EXISTS `gamezone` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `gamezone`;

-- --------------------------------------------------------

--
-- Table structure for table `computers`
--

CREATE TABLE IF NOT EXISTS `computers` (
  `id` int(2) NOT NULL,
  `pcname` varchar(10) NOT NULL,
  `ipaddress` varchar(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `computerusage`
--

CREATE TABLE IF NOT EXISTS `computerusage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pcid` int(11) NOT NULL,
  `memberid` int(11) NOT NULL,
  `pcname` varchar(10) NOT NULL,
  `startedtime` varchar(10) NOT NULL,
  `usages` varchar(10) NOT NULL,
  `usedate` date NOT NULL,
  `payment` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=26 ;

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE IF NOT EXISTS `members` (
  `memberid` int(5) NOT NULL,
  `nic` varchar(10) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `photopath` varchar(255) NOT NULL,
  PRIMARY KEY (`memberid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`memberid`, `nic`, `fname`, `lname`, `mobile`, `email`, `photopath`) VALUES
(1, 'Guest', 'Guest', 'Guest', 'Guest', 'Guest', 'Guest');

-- --------------------------------------------------------

--
-- Table structure for table `membershiptime`
--

CREATE TABLE IF NOT EXISTS `membershiptime` (
  `membertype` varchar(10) NOT NULL,
  `charge` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `membershiptime`
--

INSERT INTO `membershiptime` (`membertype`, `charge`) VALUES
('Guest', 120),
('Member', 70);

-- --------------------------------------------------------

--
-- Table structure for table `powercut`
--

CREATE TABLE IF NOT EXISTS `powercut` (
  `powercut_id` int(11) NOT NULL AUTO_INCREMENT,
  `pc_id` int(10) NOT NULL,
  `pc_name` varchar(10) NOT NULL,
  `powercut_date` varchar(10) NOT NULL,
  `powercut_time` varchar(10) NOT NULL,
  `game_started_time` varchar(10) NOT NULL,
  `game_duration` varchar(10) NOT NULL,
  `member_id` int(10) NOT NULL,
  PRIMARY KEY (`powercut_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `progressbar`
--

CREATE TABLE IF NOT EXISTS `progressbar` (
  `id` int(2) NOT NULL,
  `pvalue` int(10) NOT NULL,
  `timeclosed` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `progressbar`
--

INSERT INTO `progressbar` (`id`, `pvalue`, `timeclosed`) VALUES
(1, 0, '22:16:04');

-- --------------------------------------------------------

--
-- Table structure for table `systemusers`
--

CREATE TABLE IF NOT EXISTS `systemusers` (
  `id` int(2) NOT NULL,
  `nic` varchar(10) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `type` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `systemusers`
--

INSERT INTO `systemusers` (`id`, `nic`, `fname`, `lname`, `mobile`, `username`, `password`, `type`) VALUES
(1, '123456789v', 'Admin', 'Admin', '1234567890', 'Admin', 'admin', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `terminals`
--

CREATE TABLE IF NOT EXISTS `terminals` (
  `id` int(2) NOT NULL,
  `pcname` varchar(10) NOT NULL,
  `systime` varchar(10) NOT NULL,
  `duration` varchar(10) NOT NULL,
  `date` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `terminals`
--

INSERT INTO `terminals` (`id`, `pcname`, `systime`, `duration`, `date`) VALUES
(1, 'Ahen PC 1', '00:00:00', '0', '1996:07:13');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
