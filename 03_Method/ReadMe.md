# Buổi số 2: Phương thức

## Kinh nghiệm học lập trình
Học một tiếng

Dành ra 8 tiếng để lập trình và viết bài
Học tập trung 7 tháng, mỗi tuần 6 ngày, mỗi ngày 8 tiếng, chắc chắn xin được việc > 12 triệu/tháng

Hướng dẫn cách học tiếng Anh CNTT. Mỗi một ngày học 10 từ tiếng Anh liên quan đến CNTT.

## Từ mới tiếng Anh
Function: hàm
Method: phương thức

Class: lớp, khuôn mẫu để tạo ra nhiều đối tượng
Object: đối tượng, được tạo ra từ một class nhờ constructor.
Constructor: người xây dựng, phương thức xây dựng lên đối tượng từ class.
Odd: số lẻ
isOdd: có phải là số lẻ
method parameter: tham số truyền vào phương thức
compare (verb), comparison (noun): so sánh
assign (verb), assigment(noun): gán giá trị vào một biến
perimeter: chu vi một hình.
diameter: đường kính của một hình tròn.
&& : AND logic
|| : OR logic

```((x + y > z) && (y + z > x) && (x + z > y))``` : boolean expression: biểu thức chân lý (đúng hoặc sai)

Array: mảng lưu nhiều phần tử cùng kiểu

function khác với method ở điểm nào?

What is different between function and method?

A method, like a function, is a set of instructions that perform a task. The difference is that a method is associated with an object, while a function is not. Let's explore some of JavaScript's built-in methods.

Một phương thức, giống như một hàm, là một tập hợp các lệnh thực hiện một tác vụ. Sự khác biệt là một phương thức được liên kết với một đối tượng, trong khi một hàm thì không.

-----
== so sánh có bằng hay không? compare (verb), comparison (noun)
= gán: assign (verb), assigment(noun)

Hãy tìm hiểu chỉ số BMI


## Bài tập về nhà

Hãy lập trình vào file [Math.java](Math.java)
```java
public float average(int[] numbers) {
  return 0.0f;
}


public int[] reverseArray(int[] numbers) {
  return null;
}

// Đếm số lẻ trong một mảng
public int countOddNumber(int[] numbers) {
  return 0;
}

//Trả về mảng chỉ gồm các số lẻ. Ví dụ đầu vào 1, 2, 4, 5, 3 thì trả về [1, 5, 3]
public int[] oddNumberArray(int[] numbers) {
  return null;
}
/* Dựa vào chỉ số BMI hãy trả về các đánh giá: Nhẹ cân, Bình thường, Quá cân, Rất nguy hiểm
BMI	      Đánh giá
Dưới 18.5	Nhẹ cân
18.5—24.9	Bình thường
25.0—29.9	Quá cân
30.0      Rất nguy hiểm
*/
public String bmiRating(float height, float weight) {

}
```
```java
public float sum(int[] numbers) {
  float sum = 0f;
  for(int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
  }
  return sum;
}
```

## Bài tập nâng cao

Hãy chú thích code cẩn thận để giải thích cho những bạn khác.
### 1. Vẽ hình tam giác sao
Nhập vào một số nguyên dương 3 < N < 10 vẽ một hình tam giác sao như dưới
N = 5

```
* 
* *
* * *
* * * * 
* * * * *
```

### 2. Vẽ hình tam giác rỗng
```
*
* *
*   *
*     *
*   *
* *
*
```

### 3. Vẽ hình tam giác rỗng
nhập vào 2 số:  3 < A, B < 9 hãy vẽ hình chữ nhật cạnh ngang có A dấu *, cạnh dọc có B dấu *
Ví dụ
A = 7, B = 6
```
* * * * * * * 
*           * 
*           * 
*           * 
*           * 
* * * * * * * 
```