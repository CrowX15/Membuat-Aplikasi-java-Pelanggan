-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Nov 2024 pada 17.20
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pemrograman_desktop0057`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `ms_barang`
--

CREATE TABLE `ms_barang` (
  `kode` char(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama` char(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `satuan` char(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `harga_satuan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `ms_barang`
--

INSERT INTO `ms_barang` (`kode`, `nama`, `satuan`, `harga_satuan`) VALUES
('AR241101', 'Nudle Pack', 'pcs', 5000),
('AR241102', 'Aqua Numero', 'pcs', 3000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `ms_pelanggan`
--

CREATE TABLE `ms_pelanggan` (
  `kode` char(20) NOT NULL,
  `nama` char(200) NOT NULL,
  `alamat` text NOT NULL,
  `telepon` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `ms_pelanggan`
--

INSERT INTO `ms_pelanggan` (`kode`, `nama`, `alamat`, `telepon`) VALUES
('APP11', 'Pak Owo', 'Karatanegara', '081311111111'),
('APP21', 'Wahyu', 'Bogor Deket Sawah OrangKaya', '087777665522'),
('APP41', 'Akbar Rais Pembap Coy', 'Jakarta Tidak tau detailnya', '081356776724');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `ms_barang`
--
ALTER TABLE `ms_barang`
  ADD PRIMARY KEY (`kode`);

--
-- Indeks untuk tabel `ms_pelanggan`
--
ALTER TABLE `ms_pelanggan`
  ADD PRIMARY KEY (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
