package movie;

public class Movie1 {
	
	public static void main(String[] args) {
		
		MovieRevieMain movie1 = new MovieRevieMain();
		
		movie1.title = "범죄도시4";
		movie1.review = "마블리";
		
		MovieRevieMain movie2 = new MovieRevieMain();
		
		movie2.title = "마블";
		movie2.review ="인생 영화";
		
		MovieRevieMain[] movies = {movie1,movie2};
		
		for(MovieRevieMain m : movies) {
			System.out.println("영화 제목: " + m.title + ", 리뷰 :" + m.review);
		}
		
		
	}
}
