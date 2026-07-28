package strings_two;

// A recruitment portal receives resumes in text format. The HR team wants to identify resumes containing important technical skills such as Java,
// Spring Boot, SQL, and React. Write a program that accepts the resume content and counts how many required skills are present.

public class Recruitment {
    public static void main(String[] args) {
        String resume = "I have experience in Java, Spring Boot, and SQL. I also have some knowledge of React.";
        String[] Skills = {"Java", "Spring Boot", "SQL", "React", "Python", "Angular"};

        int Count = 0;
        for (String skill : Skills) {
            if (resume.contains(skill)) {
                Count++;
            }
        }

        System.out.println("Number of skills present in the resume: " + Count);
    }
}
