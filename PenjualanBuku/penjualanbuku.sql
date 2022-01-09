-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2022 at 07:11 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualanbuku`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Password`) VALUES
('Admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tb_buku`
--

CREATE TABLE `tb_buku` (
  `Kode_Buku` varchar(10) NOT NULL,
  `Kategori` varchar(10) NOT NULL,
  `Judul_Buku` varchar(100) NOT NULL,
  `Pengarang` varchar(50) NOT NULL,
  `Stok` int(11) NOT NULL,
  `Harga` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_buku`
--

INSERT INTO `tb_buku` (`Kode_Buku`, `Kategori`, `Judul_Buku`, `Pengarang`, `Stok`, `Harga`) VALUES
('001', 'Senang', 'Harau', 'Ancay', 5, 10000),
('002', 'Sedih', 'Sebujur bangkai', 'Imam', 5, 90000),
('003', 'Drama', 'Korea', 'Krychwok', 9, 40000),
('004', 'Mantap', 'Sibuta', 'ALdi', 90, 80000),
('005', 'Legenda', 'Sibuta dari gua batu', 'Aldi', 90, 80000),
('006', 'Nanti', 'Bisa nanti', 'Kulas', 15, 90000),
('007', 'Senang', 'Mantul', 'Kita', 10, 20000),
('008', 'Susah', 'Cari Ikan', 'Kita', 10, 20000),
('009', 'Sedih', 'Menangis air darah', 'Saya', 10, 10000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_pembeli`
--

CREATE TABLE `tb_pembeli` (
  `Nama_Pembeli` varchar(100) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Telepon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_pembeli`
--

INSERT INTO `tb_pembeli` (`Nama_Pembeli`, `Alamat`, `Telepon`) VALUES
('Agus', 'Tapin', '081545438801'),
('Aldi', 'Binuang', '081383873288'),
('Amang', 'Binuang', '081234567812'),
('Andi', 'Barabai', '088210172009'),
('Hanna', 'Pantai Cabe', '081909188379'),
('Hery', 'Marabahan', '081908389473');

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `No_Transaksi` varchar(10) NOT NULL,
  `Tanggal` date NOT NULL,
  `Nama_Pembeli` varchar(100) NOT NULL,
  `Kode_Buku` varchar(10) NOT NULL,
  `Harga` int(20) NOT NULL,
  `Dibayar` int(11) NOT NULL,
  `Kembali` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`No_Transaksi`, `Tanggal`, `Nama_Pembeli`, `Kode_Buku`, `Harga`, `Dibayar`, `Kembali`) VALUES
('001', '2022-01-01', 'Agus', '001', 90000, 10000, 100000),
('002', '2022-01-03', 'Amang', '002', 90000, 100000, 10000),
('003', '2022-01-03', 'Andi', '002', 80000, 100000, 20000),
('004', '2022-01-03', 'Hanna', '004', 10000, 20000, 10000),
('006', '2022-01-03', 'Hery', '001', 10000, 90000, 80000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `tb_buku`
--
ALTER TABLE `tb_buku`
  ADD PRIMARY KEY (`Kode_Buku`),
  ADD KEY `Kode_Kategori` (`Kategori`);

--
-- Indexes for table `tb_pembeli`
--
ALTER TABLE `tb_pembeli`
  ADD PRIMARY KEY (`Nama_Pembeli`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`No_Transaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
