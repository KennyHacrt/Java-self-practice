static double median(int[] a1, int[] a2) {
    int len1 = a1.length;
    int len2 = a2.length;
    int left = 0;
    int right, mid, cal, cal2;
    if (len2 > len1) return median(a2, a1);
    right = len2 - 1;
    cal = (len1 + len2) / 2;
    while (left <= right) {
        mid = (left + right) / 2;
        if (mid == len2 - 1) break;
        cal2 = cal - mid - 2;
        if (a1[cal2] <= a2[mid + 1] && a2[mid] <= a1[cal2 + 1]) {
            if ((len1 + len2) % 2 == 1) {
                if (a2[mid + 1] <= a1[cal2 + 1]) return a2[mid + 1];
                else return a1[cal2 + 1];
            } else {
                if (a2[mid + 1] <= a1[cal2 + 1]) {
                    if (a2[mid] <= a1[cal2]) return (a2[mid + 1] + a1[cal2]) / 2.0;
                    else return (a2[mid + 1] + a2[mid]) / 2.0;
                } else {
                    if (a2[mid] <= a1[cal2]) return (a1[cal2 + 1] + a1[cal2]) / 2.0;
                    else return (a1[cal2 + 1] + a2[mid]) / 2.0;
                }
            }
        } else if (a2[mid] > a1[cal2 + 1]) right = mid - 1;
        else left = mid + 1;
    }
    if (len1 == len2) {
        if (a2[0] > a1[len1 - 1]) return (a2[0] + a1[len1 - 1]) / 2.0;
        else return (a2[len2 - 1] + a1[0]) / 2.0;
    } else {
        if (a2[0] > a1[cal - 1]) {
            if ((len1 + len2) % 2 == 1) {
                if (a1[cal] > a2[0]) return a2[0];
                else return a1[cal];
            } else {
                if (a1[cal] < a2[0]) return (a1[cal] + a1[cal - 1]) / 2.0;
                else return (a1[cal - 1] + a2[0]) / 2.0;
            }
        } else {
            if ((len1 + len2) % 2 == 1) {
                if (a1[cal - len2] > a2[len2 - 1]) return a2[len2 - 1];
                else return (a1[cal - len2]);
            } else {
                if (a1[cal - len2 - 1] > a2[len2 - 1]) return (a1[cal - len2 - 1] + a1[cal - len2]) / 2.0;
                else return (a2[len2 - 1] + a1[cal - len2]) / 2.0;
            }
        }
    }
}
