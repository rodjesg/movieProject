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
-- Tabelstructuur voor tabel `actors`
--

CREATE TABLE `actors` (
  `Actors_Id` int(11) NOT NULL,
  `A_Firstname` varchar(255) NOT NULL,
  `A_Middlename` varchar(255) NOT NULL,
  `A_Lastname` varchar(255) NOT NULL,
  `A_Date_Birth` date NOT NULL,
  `A_City_birth` varchar(255) NOT NULL,
  `A_Country_birth` varchar(255) NOT NULL,
  `Movie_Id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `directors`
--

CREATE TABLE `directors` (
  `Directors_Id` int(11) NOT NULL,
  `D_Firstname` varchar(255) NOT NULL,
  `D_Middlename` varchar(255) NOT NULL,
  `D_Lastname` varchar(255) NOT NULL,
  `D_Date_Birth` date NOT NULL,
  `D_City_birth` varchar(255) NOT NULL,
  `D_Country_birth` varchar(255) NOT NULL,
  `Movie_Id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `movie`
--

CREATE TABLE `movie` (
  `Movie_Id` int(11) NOT NULL,
  `M_Title` varchar(255) NOT NULL,
  `M_Releasedate` date NOT NULL,
  `Actors_Id` int(255) NOT NULL,
  `Directors_Id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `actors`
--
ALTER TABLE `actors`
  ADD PRIMARY KEY (`Actors_Id`),
  ADD KEY `Movie` (`Movie_Id`);

--
-- Indexen voor tabel `directors`
--
ALTER TABLE `directors`
  ADD PRIMARY KEY (`Directors_Id`),
  ADD KEY `Movie` (`Movie_Id`);

--
-- Indexen voor tabel `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`Movie_Id`),
  ADD KEY `Actors` (`Actors_Id`),
  ADD KEY `Directors` (`Directors_Id`);

--
-- AUTO_INCREMENT voor geëxporteerde tabellen
--

--
-- AUTO_INCREMENT voor een tabel `actors`
--
ALTER TABLE `actors`
  MODIFY `Actors_Id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT voor een tabel `directors`
--
ALTER TABLE `directors`
  MODIFY `Directors_Id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT voor een tabel `movie`
--
ALTER TABLE `movie`
  MODIFY `Movie_Id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
