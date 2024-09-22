public class lecture_1 {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long elapsedTime;
       /* The input is an array for questions 1–7 and two arrays for the last.

        Find the index of a peak, i.e., an element that is not smaller than its neighbor(s).
        Example: [10, 20, 15, 2, 23, 90, 45, 67] -> any of 1(20), 5 (90), and 7 (67).

        */
        System.out.println("ex1");
        int test[] = {10, 20, 15, 2, 23, 90, 45, 67};
        int len = test.length;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                if (test[i] > test[i + 1]) {
                    System.out.println(i + "(" + test[i] + ")");
                }
            } else if (i == len - 1) {
                if (test[i] > test[i - 1]) {
                    System.out.println(i + "(" + test[i] + ")");
                }
            } else {
                if (test[i] > test[i + 1] && test[i] > test[i - 1]) {
                    System.out.println(i + "(" + test[i] + ")");
                }
            }
        }
        /*
        Find the indices of a maximum element and a minimum element simultaneously, with the minimum number of comparisons among elements (the comparisons among indices are not counted).
        Example: [10, 20, 15, 2, 23, 90, 45, 67] -> 5 (90) and 3 (2).*/
        startTime = System.nanoTime();
        System.out.println("ex2 V.1");
        int max = test[0];
        int min = test[0];
        int index_max = 0;
        int index_min = 0;
        for (int i = 1; i < len; i++) {
            if (test[i] > max) {
                max = test[i];
                index_max = i;
            }
            if (test[i] < min) {
                min = test[i];
                index_min = i;
            }
        }
        System.out.println(index_max + "(" + max + ")");
        System.out.println(index_min + "(" + min + ")");
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        startTime = System.nanoTime();
        System.out.println("ex2 V.2(faster)");
        int index_max2 = 0;
        int index_min2 = 0;
        for (int i = 1; i < len; i++) {
            if (test[i] > test[index_max2]) {
                index_max2 = i;
            }
            if (test[i] < test[index_min2]) {
                index_min2 = i;
            }
        }
        System.out.println(index_max2 + "(" + test[index_max2] + ")");
        System.out.println(index_min2 + "(" + test[index_min2] + ")");
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        /*
        Find the index of one of the second largest elements with the minimum number of comparisons among elements (the comparisons among indices are not counted).
        Examples: [9, 8, 7] -> 1 (the index of 8); [9, 9, 6] -> 0 or 1 (the index of one of the 9’s); [9, 6, 6] -> 1 or 2 (the index of one of the 6’s).*/
        System.out.println("ex3");
        int test2[] = {9, 8, 7};
        int test3[] = {9, 9, 6};
        int test4[] = {9, 6, 6};
        int leng = test3.length;
        int largest1 = test3[0];
        int largest2 = Integer.MIN_VALUE;
        int index_2nd = -1;
        for (int i = 1; i < leng; i++) {
            if (test3[i] > largest1) {
                largest1 = test[i];
            } else if (test3[i] > largest2 && test3[i] <= largest1) {
                largest2 = test[i];
                index_2nd = i;
            }
        }
        System.out.println(index_2nd);
        /*
        Find the index of the kth smallest element.
        Example: [65, 85, 17, 88, 66, 71, 45, 38, 95, 48, 18, 68, 60, 96, 55] -> 9 (48) when k = 5.*/
        System.out.println("ex4");
        int[] Example = {65, 85, 17, 88, 66, 71, 45, 38, 95, 48, 18, 68, 60, 96, 55};
        int[] copy = Example.clone();
        int k = 5;
        int temp3;
        for (int i = 0; i < Example.length - 1; i++) {
            if (Example[i] > Example[i + 1]) {
                for (int j = i; j >= 0; j--) {
                    if (Example[j] > Example[j + 1]) {
                        temp3 = Example[j];
                        Example[j] = Example[j + 1];
                        Example[j + 1] = temp3;
                    } else break;
                }
            }
        }
        for (int j = 0; j < Example.length; j++) {
            if (copy[j] == Example[k - 1]) {
                System.out.println(j);
            }
        }


        /*Find the first element that occurs a times.
        Example: [3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2] -> 1 (when a = 2), 2 (when a = 3).*/
        System.out.println("ex5 V.1 O(n^2)");
        int[] Example5 = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2, 3, 3, 3};
        int count;
        int a = 3;
        for (int i = 0; i < Example5.length; i++) {
            count = 0;
            for (int j = i; j < Example5.length; j++) {
                if (Example5[i] == Example5[j]) {
                    count++;
                }
            }
            if (count == a) {
                System.out.println(Example5[i]);
                break;
            }
        }

        /*Are there duplicate elements within k distance from each other (e.g., no worker is supposed to work overtime twice a week)?
        Example: [1, 2, 3, 4, 1, 2, 3, 4] -> True (when b = 4), False (when b = 3).*/
        System.out.println("ex6");
        int[] Example6 = {1, 2, 3, 4, 1, 2, 3, 4};
        int b =4;
        boolean determine = false;
        for (int i = 0; i < Example6.length; i++) {
            if (i + b >= Example6.length) {
                for (int j = i + 1; j < Example6.length; j++) {
                    if (Example6[i] == Example6[j]) {
                        determine = true;
                    }
                }
            }
            else {
                for (int d = i + 1; d <= i + b; d++) {
                    if (Example6[i] == Example6[d]) {
                        determine = true;
                    }
                }
            }
        }
            System.out.println(determine);
        /*Find the maximum distance between two occurrences of the same element.
                Example:  [3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2] -> 10.*/
        System.out.println("ex7");
        int []Example7= {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int distance=-1;
        for(int i =0;i<Example7.length-1;i++){
            for(int j=i+1;j<Example7.length;j++){
                if(Example7[i]==Example7[j]){
                    if (j-i>distance){
                        distance=j-i;
                    }
                }
            }

        }
        System.out.println(distance);

        /*Are two given arrays disjoint?
        Example: [12, 34, 11, 9, 3],  [2, 1, 3, 5] -> False (both containing 3).*/
            System.out.println("ex8 V.1");
            startTime = System.nanoTime();
            int disjoint1[] = {12, 34, 11, 9, 3};
            int disjoint2[] = {2, 1, 3, 5};
            int length1 = disjoint1.length;
            int length2 = disjoint2.length;
            int temp, repeated = 0, left, right, mid, goal;

            boolean check = true;
            //use insertion sort for the shorter
            if (disjoint1.length > disjoint2.length) {
                length2 = disjoint2.length;
                for (int i = 0; i < length2 - 1; i++) {
                    if (disjoint2[i] > disjoint2[i + 1]) {
                        for (int j = i; j >= 0; j--) {
                            if (disjoint2[j] > disjoint2[j + 1]) {
                                temp = disjoint2[j];
                                disjoint2[j] = disjoint2[j + 1];
                                disjoint2[j + 1] = temp;
                            } else break;
                        }
                    }
                }
                //loop larger array and use binary search in smaller array
                for (int i = 0; i < length1; i++) {
                    left = 0;
                    right = length2 - 1;
                    goal = disjoint1[i];
                    while (left <= right && check == true) {
                        mid = (left + right) / 2;
                        if (disjoint2[mid] == goal) {
                            check = false;
                            repeated = disjoint2[mid];
                            break;
                        } else if (disjoint2[mid] > goal) {
                            right = mid - 1;
                        } else {
                            left = mid + 1;
                        }
                    }

                }
            } else {
                length1 = disjoint1.length;
                for (int i = 0; i < length1 - 1; i++) {
                    if (disjoint1[i] > disjoint1[i + 1]) {
                        for (int j = i; j >= 0; j--) {
                            if (disjoint1[j] > disjoint1[j + 1]) {
                                temp = disjoint1[j];
                                disjoint1[j] = disjoint1[j + 1];
                                disjoint1[j + 1] = temp;
                            } else break;
                        }
                    }
                }
                //loop larger array and use binary search in smaller array
                for (int i = 0; i < length2; i++) {
                    left = 0;
                    right = length1 - 1;
                    goal = disjoint2[i];
                    while (left <= right && check == true) {
                        mid = (left + right) / 2;
                        if (disjoint1[mid] == goal) {
                            check = false;
                            repeated = disjoint1[mid];
                            break;
                        } else if (disjoint1[mid] > goal) {
                            right = mid - 1;
                        } else {
                            left = mid + 1;
                        }
                    }

                }
            }
            if (check) {
                System.out.println("True, they are disjoint");
            } else {
                System.out.println("false,(both containing " + repeated + ")");
            }
            endTime = System.nanoTime();
            System.out.println(endTime - startTime);

            System.out.println("ex8 V.2 O(n^2)");
            startTime = System.nanoTime();
            repeated = 0;
            boolean check1 = true;
            if (length1 > length2) {
                for (int i = 0; i < length1; i++) {
                    for (int j = 0; j < length2; j++) {
                        if (disjoint1[i] == disjoint2[j]) {
                            repeated = disjoint1[i];
                            check1 = false;
                            break;
                        }
                    }
                }
            } else {
                for (int i = 0; i < length2; i++) {
                    for (int j = 0; j < length1; j++) {
                        if (disjoint2[i] == disjoint1[j]) {
                            repeated = disjoint1[j];
                            check1 = false;
                            break;
                        }
                    }
                }
            }
            if (check1) {
                System.out.println("True, they are disjoint");
            } else {
                System.out.println("false,(both containing " + repeated + ")");
            }
            endTime = System.nanoTime();
            System.out.println(endTime - startTime);

    }
}
