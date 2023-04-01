public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
	
    // 리스트에 숫자넣기
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++) {
      list.add(Integer.parseInt(br.readLine()));
    }
	
    // 오름차순 정렬
    Collections.sort(list);
	
    // 출력
    for(int value : list) {
      sb.append(value).append('\n');
    }
    System.out.println(sb);
}
