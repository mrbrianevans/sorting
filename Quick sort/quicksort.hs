quicksort :: [Int] -> [Int]
quicksort [] = []
quicksort [x] = [x]
quicksort [x,y] = [min x y, max x y]
quicksort (x:xs) = (quicksort (filter (<=x) xs))
                   ++ [x] ++
                   (quicksort (filter (>x) xs))
