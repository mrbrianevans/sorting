<?php

class SelectionSort
{
    public function selectionSorter($array)
    {
        $unsortedSize = count($array);
        while ($unsortedSize > 1) {
            $maxPos = 0;
            for ($i = 0; $i < $unsortedSize; $i++) {
                if ($array[$i] >= $array[$maxPos])
                    $maxPos = $i;
            }
            $unsortedMax = $array[$maxPos];
            $array[$maxPos] = $array[--$unsortedSize];
            $array[$unsortedSize] = $unsortedMax;
        }
        return $array;
    }
}
