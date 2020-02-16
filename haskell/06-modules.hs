-- Original author Miran Lipovaca
-- Modifications by Kevin Kredit
-- Licensed under https://creativecommons.org/licenses/by-nc-sa/3.0/

-- http://learnyouahaskell.com/modules

module Main
  where

-- Imports must be before defining any functions but after 'module Main'
import Data.List
import qualified Data.Map as M
import qualified Geometry.Sphere as Sphere
import qualified Geometry.Cuboid as Cuboid
import qualified Geometry.Cube as Cube

main = print $ Sphere.area 5

numUniques :: (Eq a) => [a] -> Int
numUniques = length . nub
