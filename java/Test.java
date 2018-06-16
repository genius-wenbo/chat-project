public enum Test {
	MAO(1),
	SUN(2);

	int value;

	Test (int i) {
		value = i;
	}

	public static void main(String[] args) {
		System.out.println(Test.valueOf("MAO").value);
	}
}