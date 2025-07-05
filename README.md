## Patika.dev Merge Sort Project

> Example Array : [16,21,11,8,12,22]

### Stages

* n   : [16,21,11,8,12,22]
* n-1 : [16,21,11], [8,12,22]
* n-2 : [16], [21,11], [8], [12,22]
* n-2 : [16], [21], [11], [8], [12], [22]
* n-3 : [16], [11, 21], [8], [12], [22]
* n-4 : [11, 16, 21], [8], [12], [22]
* n-5 : [11, 16, 21], [8], [12, 22]
* n-6 : [11, 16, 21], [8, 12, 22]
* n-7 : [8, 11, 16, 21], [12, 22]
* n-8 : [8, 11, 12, 16, 21], [22]
* n-9 : [8, 11, 12, 16, 21, 22]

### Big-O

> Best Case : O(nlogn)
>
> Average Case : O(nlogn)
>
> Worst Case : O(nlogn)

### Output
![Screenshot 2025-07-05 at 12 17 51 pm](https://github.com/user-attachments/assets/16aee433-3aa7-49f7-b6e7-c4537f32d2a7)
