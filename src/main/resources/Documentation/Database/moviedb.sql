-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Gegenereerd op: 25 okt 2016 om 22:36
-- Serverversie: 10.1.13-MariaDB
-- PHP-versie: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `moviedb`
--

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `People`
--

CREATE TABLE `People` (
  `People_Id` int(11) NOT NULL,
  `Firstname` varchar(255) NOT NULL,
  `Middlename` varchar(255) NOT NULL,
  `Lastname` varchar(255) NOT NULL,
  `Date_Birth` date NOT NULL,
  `Died` date NOT NULL,
  `City_birth` varchar(255) NOT NULL,
  `Country_birth` varchar(255) NOT NULL,
  `Movie_Id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `Movie`
--

CREATE TABLE `Movie` (
  `Movie_Id` int(11) NOT NULL,
  `Title` varchar(255) NOT NULL,
  `Releasedate` date NOT NULL,
  `Rating` int(11) NOT NULL,
  `People_Id` int(255) NOT NULL,
  `Rol_Id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- --------------------------------------------------------


--
-- Tabelstructuur voor tabel `Rol`
--

CREATE TABLE `Rol` (
  `Rol_Id` int(11) NOT NULL,
  `Title` varchar(255) NOT NULL,
  `Description` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `People`
--
ALTER TABLE `People`
  ADD PRIMARY KEY (`People_Id`),
  ADD KEY `Movie` (`Movie_Id`);


--
-- Indexen voor tabel `movie`
--
ALTER TABLE `Movie`
  ADD PRIMARY KEY (`Movie_Id`),
  ADD KEY `People` (`People_Id`),
  ADD KEY `Rol` (`Rol_Id`);

--
-- AUTO_INCREMENT voor geëxporteerde tabellen
--

--
-- AUTO_INCREMENT voor een tabel `actors`
--
ALTER TABLE `People`
  MODIFY `People_Id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT voor een tabel `directors`
--

--
-- AUTO_INCREMENT voor een tabel `movie`
--
ALTER TABLE `Movie`
  MODIFY `Movie_Id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
