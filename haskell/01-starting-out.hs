-- Original author Miran Lipovaca
-- Modifications by Kevin Kredit
-- Licensed under https://creativecommons.org/licenses/by-nc-sa/3.0/

-- http://learnyouahaskell.com/starting-out

module Main
  where

main = putStrLn "This file meant to be loaded in GHCI"

-- Basic functions
doubleMe2 x = doubleMe x
doubleMe x = x + x
doubleUs x y = x*2 + y*2
doubleUs2 x y = doubleMe x + doubleMe y

doubleSmallNumber x = if x > 100
                      then x
                      else x*2
canYouHaveSingleQuotesInFunctions' x = x + 2
yesYouCan' x = x
conanO'Brian = "It's me, Cooonan!"

-- List compressions
boomBangs xs = [ if x < 10 then "BOOM!" else "BANG!" | x <- xs, odd x]
booms = boomBangs (take 10 [5,7..])
emptyBooms = boomBangs [24,20..0]

nouns = ["baby", "frog", "hacker"]
adjectives = ["happy", "scheming", "brooding"]
phrases = [adj ++ " " ++ noun | adj <- adjectives, noun <- nouns]
getPhrase x = phrases !! x

length' xs = sum [1 | _ <- xs]

removeNonUppercase st = [ c | c <- st, c `elem` ['A'..'Z']]

-- Tuples
numberNames = zip [1 .. 5] ["one", "two", "three", "four", "five"]
getNumName x = snd (numberNames !! (x - 1))

-- Problem: find right triangles with a perimeter == 24
triangles = [(a,b,c) | c <- [1..12], b <- [1..c], a <- [1..b]]
rightTriangles = [(a,b,c) | c <- [1..12], b <- [1..c], a <- [1..b], a^2 + b^2 == c^2]
answer = [(a,b,c) | c <- [1..12], b <- [1..c], a <- [1..b], a^2 + b^2 == c^2, a + b + c == 24]
