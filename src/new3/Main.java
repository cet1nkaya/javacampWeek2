package new3;

public class Main {

	public static void main(String[] args) {
		Lecture lecture1 = new Lecture(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", 0.0, "Engin Demirog");
		Lecture lecture2 = new Lecture(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", 19.0, "Engin Demirog");
		Lecture lecture3 = new Lecture(3, "Programlamaya Giri� ��in Temel Kurs", 100.0, "Engin Demirog");
		Lecture[] lectures = {lecture1, lecture2, lecture3};
		for(Lecture a:lectures) {
			System.out.println(a.courseName);
			System.out.println(a.courseCompletionPercent + " tamamland�.");
			System.out.println("Yazar: " + a.courseAuthor);
			System.out.println("-------------------------");
		}
		
		LectureManager lecture = new LectureManager();
		lecture.enterLecture(lecture1);
		lecture.enterLecture(lecture2);
		lecture.enterLecture(lecture3);
		lecture.proceedNextLecture();
		}
	}


