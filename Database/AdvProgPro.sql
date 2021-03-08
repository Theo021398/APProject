-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 08, 2021 at 12:37 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ap project database`
--

-- --------------------------------------------------------

--
-- Table structure for table `complaint`
--

CREATE TABLE `complaint` (
  `ComplaintID` int(1) NOT NULL,
  `ComplaintStatus` varchar(10) NOT NULL,
  `IssueType` varchar(20) NOT NULL,
  `IssueDetails` longtext NOT NULL,
  `CustomerID` int(11) NOT NULL,
  `StaffID` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Table is used to record the Complaints of customers';

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `CustomerID` int(11) NOT NULL,
  `CustomerPassword` int(5) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `CustomerContact` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `StaffID` varchar(5) NOT NULL,
  `StaffPassword` int(5) NOT NULL,
  `EmployeeFirstName` varchar(30) NOT NULL,
  `EmployeeLastName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `product_specific_complaint`
--

CREATE TABLE `product_specific_complaint` (
  `ComplaintID` int(11) NOT NULL,
  `Broadband` longtext NOT NULL,
  `Mobile` longtext NOT NULL,
  `HomePhone` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `quality_ofservice_complaint`
--

CREATE TABLE `quality_ofservice_complaint` (
  `ComplaintID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `query`
--

CREATE TABLE `query` (
  `QueryID` int(5) NOT NULL,
  `PayStatus` varchar(10) NOT NULL,
  `AmtDue` decimal(10,0) DEFAULT NULL,
  `DueDate` datetime NOT NULL,
  `CustomerID` int(11) NOT NULL,
  `StaffID` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `representative`
--

CREATE TABLE `representative` (
  `StaffID` varchar(5) NOT NULL,
  `TechnicianID` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `technician`
--

CREATE TABLE `technician` (
  `StaffID` varchar(5) NOT NULL,
  `ResponseDate` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wait_time_complaint`
--

CREATE TABLE `wait_time_complaint` (
  `ComplaintID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `complaint`
--
ALTER TABLE `complaint`
  ADD PRIMARY KEY (`ComplaintID`),
  ADD KEY `fk_complaint_customer` (`CustomerID`),
  ADD KEY `fk_Complaint_Representative` (`StaffID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`CustomerID`),
  ADD UNIQUE KEY `CustomerPassword` (`CustomerPassword`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`StaffID`);

--
-- Indexes for table `product_specific_complaint`
--
ALTER TABLE `product_specific_complaint`
  ADD PRIMARY KEY (`ComplaintID`);

--
-- Indexes for table `quality_ofservice_complaint`
--
ALTER TABLE `quality_ofservice_complaint`
  ADD PRIMARY KEY (`ComplaintID`);

--
-- Indexes for table `query`
--
ALTER TABLE `query`
  ADD PRIMARY KEY (`QueryID`),
  ADD KEY `fk_Query_Customer` (`CustomerID`),
  ADD KEY `fk_Query_Technician` (`StaffID`);

--
-- Indexes for table `representative`
--
ALTER TABLE `representative`
  ADD PRIMARY KEY (`StaffID`),
  ADD UNIQUE KEY `TechnicianID` (`TechnicianID`);

--
-- Indexes for table `technician`
--
ALTER TABLE `technician`
  ADD PRIMARY KEY (`StaffID`);

--
-- Indexes for table `wait_time_complaint`
--
ALTER TABLE `wait_time_complaint`
  ADD PRIMARY KEY (`ComplaintID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `complaint`
--
ALTER TABLE `complaint`
  MODIFY `ComplaintID` int(1) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `query`
--
ALTER TABLE `query`
  MODIFY `QueryID` int(5) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `complaint`
--
ALTER TABLE `complaint`
  ADD CONSTRAINT `fk_Complaint_Representative` FOREIGN KEY (`StaffID`) REFERENCES `representative` (`StaffID`),
  ADD CONSTRAINT `fk_complaint_customer` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`);

--
-- Constraints for table `product_specific_complaint`
--
ALTER TABLE `product_specific_complaint`
  ADD CONSTRAINT `fk_PSC_Complaint` FOREIGN KEY (`ComplaintID`) REFERENCES `complaint` (`ComplaintID`);

--
-- Constraints for table `quality_ofservice_complaint`
--
ALTER TABLE `quality_ofservice_complaint`
  ADD CONSTRAINT `fk_QOS_Complaint` FOREIGN KEY (`ComplaintID`) REFERENCES `complaint` (`ComplaintID`);

--
-- Constraints for table `query`
--
ALTER TABLE `query`
  ADD CONSTRAINT `fk_Query_Customer` FOREIGN KEY (`CustomerID`) REFERENCES `customer` (`CustomerID`),
  ADD CONSTRAINT `fk_Query_Technician` FOREIGN KEY (`StaffID`) REFERENCES `technician` (`StaffID`);

--
-- Constraints for table `representative`
--
ALTER TABLE `representative`
  ADD CONSTRAINT `fk_Representative_Employee` FOREIGN KEY (`StaffID`) REFERENCES `employee` (`StaffID`),
  ADD CONSTRAINT `fk_Representative_Technician` FOREIGN KEY (`TechnicianID`) REFERENCES `technician` (`StaffID`);

--
-- Constraints for table `technician`
--
ALTER TABLE `technician`
  ADD CONSTRAINT `fk_Technician_Employee` FOREIGN KEY (`StaffID`) REFERENCES `employee` (`StaffID`);

--
-- Constraints for table `wait_time_complaint`
--
ALTER TABLE `wait_time_complaint`
  ADD CONSTRAINT `fk_WTC_Complaint` FOREIGN KEY (`ComplaintID`) REFERENCES `complaint` (`ComplaintID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
