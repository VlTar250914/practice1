class ThirdTask {
	static int digits(String in) {
		if (in.isEmpty()) return 0;
		return digits(in.substring(1)) + (Character.isDigit(in[0]) ? 1 : 0);
	}
}