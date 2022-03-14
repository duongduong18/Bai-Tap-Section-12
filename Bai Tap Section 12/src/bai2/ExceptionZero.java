package bai2;

public class ExceptionZero {

	public static void main(String[] args) {
		try {
			chiaHaiSo(5, 0);
		} catch (ZeroException e) {
			System.out.println(e.getError());
		}

	}

	public static void chiaHaiSo(int a, int b) throws ZeroException {
		try {
			int kq = a / b;
			System.out.println(kq);
		} catch (Exception e) {
			throw new ZeroException("xảy ra lỗi : " + e);
		}
	}
}