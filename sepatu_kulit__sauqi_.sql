-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2019 at 01:23 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `impal`
--

-- --------------------------------------------------------

--
-- Table structure for table `sepatu kulit "sauqi"`
--

CREATE TABLE `sepatu kulit "sauqi"` (
  `Nama_Sepatu` varchar(30) NOT NULL,
  `Ukuran` varchar(30) NOT NULL,
  `Jumlah_Sepatu` varchar(30) NOT NULL,
  `Harga` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sepatu kulit "sauqi"`
--

INSERT INTO `sepatu kulit "sauqi"` (`Nama_Sepatu`, `Ukuran`, `Jumlah_Sepatu`, `Harga`) VALUES
('Brodo Casual', '42', '8', 'Rp. 280.000'),
('Jager', '41', '12', 'Rp. 200.000'),
('Mokasino', '40', '20', 'Rp. 200.000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sepatu kulit "sauqi"`
--
ALTER TABLE `sepatu kulit "sauqi"`
  ADD PRIMARY KEY (`Nama_Sepatu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
