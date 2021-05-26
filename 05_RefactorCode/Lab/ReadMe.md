#  Tối ưu code
Số nguyên tố.

Số chỉ chia hết cho 1 và chính nó.

12 = 2 * 2 * 3
20 = 2 * 2 * 5
81 = 3 * 3 * 3 * 3

## Thực hành

viết một hàm trả về N số nguyên tố đầu tiên
for (int i = 1, i < X, i++) {
  checkIf i isPrime
  true --> gán i vào mảng số nguyên tô
  khi nào số phần tử mảng = N thì dừng
}

## Thực hành thêm

Hãy debug từng bước phương thức ```createArrayPrimeNumbersD``` trong file [PrimeUtil.java](PrimeUtil.java)
```java
public long[] createArrayPrimeNumbersD(int n) {
  long[] result = new long[n];
  result[0] = 2; //Số nguyên tố đầu tiên
  int count = 0;
  int numberToCheck = 3; //Bỏ qua số 2 là số nguyên tố đã tìm được rồi
  
  while (count < n) {
    boolean isPrime = true;
    long sqrtOfNumberToCheck = (long) Math.sqrt((double)numberToCheck); //căn bậc 2 của number
    
    for (int i = 0; result[i] <= sqrtOfNumberToCheck; i++) {
      if (numberToCheck % result[i] == 0) {
        isPrime = false;
        break; // không phải số nguyên tố
      }
    }
    if (isPrime) {
      result[count] = numberToCheck;
      count++;
    }
    
    numberToCheck += 2;
  }

  return result;
}
```