-- Original author Miran Lipovaca
-- Modifications by Kevin Kredit
-- Licensed under https://creativecommons.org/licenses/by-nc-sa/3.0/

-- http://learnyouahaskell.com/types-and-typeclasses

module Main
  where

main = putStrLn "This file meant to be loaded in GHCI"

-- Functions with type declarations
removeNonUppercase :: String -> String
removeNonUppercase st = [ c | c <- st, c `elem` ['A'..'Z']]

addThree :: Int -> Int -> Int -> Int
addThree x y z = x + y + z

factorial :: Integer -> Integer
factorial n = product [1..n]

circumference :: Float -> Float
circumference r = 2 * pi * r
circumference' :: Double -> Double
circumference' r = 2 * pi * r
