# Ví dụ về 4 tính chất trong lập trình hướng đối tượng.

1. Encapsulation: đóng gói
2. Abstraction: trừu tượng
3. Inheritance: kế thừa
4. Polymorphism: đa hình

## 1. Encapsulation - Đóng gói

Tại sao phải đóng gói? và đóng gói cái gì?
Đóng gói để che dấu những biến, những phương thức nội bộ. Việc này cũng giống trong tự nhiên, mỗi đối tượng đều có những thuộc tính, hành vi không nên công khai.

Ví dụ Bắc Triều Tiên luôn công khai 2 hành động đó là hoạt động xếp hình biển người và phóng thử tên lửa. Tuy nhiên để đổi lấy viện trợ lương thực, Bắc Triều Tiên phải che dấu thật kỹ chương trình làm giàu chất Plutonium ```private void enrichPlutonium()```

```java
public class NorthKorea {
  private void enrichPlutonium() {
    System.out.println("No one should know about this. So it must be private");
  }

  public void runPanoramaShow() {
    System.out.println("It is beautiful so every one should know");
  }

  public void demoNuclearMissile() {
    System.out.println("To threaten South Korea and US");
  }
}
```

Ví dụ khác: một bà mẹ đơn thân có một người con. Người con này học rất giỏi. Do đó bà mẹ này luôn chia sẻ lên mạng xã hội thành tích học tập của con. Đây là ví dụ của ```public```

Bà mẹ này gửi tích kiệm 500 triệu VND để dành cho người con chuẩn bị đi Mỹ du học. Bà hoàn toàn không nói cho ai, ngoài con và người thân trong gia đình. Vậy đây là ví dụ của ```protected```

Bà mẹ này không bao giờ nói cho con và bất kỳ ai biết bố đẻ thực sự là ai. Vậy đây là ví dụ của ```private```

Mặc định Java còn có giới hạn truy cập mức độ ```package```. Trong một công ty mọi người biết mã số mở cửa tự động. Người ngoài công ty không thể biết. Mã số mở cửa tự động cũng chả của riêng ai.

*Nếu không có đóng gói, encapsulation thì điều gì xảy ra?*


## 2. Abstraction : trừu tượng

Trừu tượng đi cùng tính khai quát. Ví dụ những người châu Á có mắt đen, da vàng. Người Nhật chăm chỉ.