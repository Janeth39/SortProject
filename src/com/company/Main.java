package com.company;

public class Main {

        public static int Sort (int num[] , int r)
        {
            int x = 0;
            int target = r;
            int min = 0;
            int max = num.length;
            int mid = middle(min, max);

            if (num.length > 1)
            {
                while (target != x)
                {
                    if (target < num[mid])
                    {
                        max = mid;
                    } else if (target > num[mid])
                    {
                        min = mid;
                    }
                    mid = middle(min, max);
                    x = num[mid];
                }

                return mid;
            }
            return -1;
        }


        public static int middle (int min, int max)
        {
            int middle = (min +max) /2;

            return middle;
        }

}


