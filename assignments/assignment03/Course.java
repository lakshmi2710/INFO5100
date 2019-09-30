import java.util.Arrays;

public class Course {
	
	private int courseId;
	private String courseName;
	private int maxCapacity;
	private int professorId;
	private int credits;
	private int[] studentIds = new int[100];
	private int studentCount = 0;
	
	public void registerStudent(int studentId) {
		this.studentIds[studentCount] = studentId;
		studentCount = studentCount + 1;
	}
	
	public int[] getStudentIds() {
		int[] getterStd = new int[studentCount];
		for(int i=0;i<studentCount;i++) {
			getterStd[i] = this.studentIds[i];
		}
		return getterStd;
    }
	
	Course(int courseId){
		this.courseId = courseId;
	}
	
	Course(int courseId, int professorId){
		this.courseId = courseId;
		this.professorId = professorId;
	}
	
	Course(int courseId, int professorId, int credit){
		this.courseId = courseId;
		this.professorId = professorId;
		this.credits = credit;				
	}
	
	public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
    	if(courseId<0)
			System.out.println("CourseId should not be less than zero");
		else
			this.courseId = courseId;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName.length()<10 || courseName.length()>60)
			System.out.println("CourseName is invalid");
		else
			this.courseName = courseName;
    }
    
    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        
        if(maxCapacity<10 || maxCapacity>100)
			System.out.println("maxCapacity is invalid");
		else
			this.maxCapacity = maxCapacity;
    }
    
    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        if(professorId<100000 || professorId>999999)
			System.out.println("Professor id is invalid");
		else
			this.professorId = professorId;
    }
    
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if(credits<1 || credits>9)
			System.out.println("credits id is invalid");
		else
			this.credits = credits;
    }
    
    public int[] removeDuplicates(int[] studentIds) {
    	int dupCount = 0;
    	Arrays.sort(studentIds);
    	for(int i=1;i<studentIds.length;i++) {
    		if(studentIds[i] == studentIds[i-1])
    			dupCount += 1;
    	}
    	
    	int[] newArray = new int[studentIds.length-dupCount];
    	newArray[0] = studentIds[0];
    	for(int i=1, j=1; i<studentIds.length; i++) {
    		if(studentIds[i] == studentIds[i-1])
    			continue;
    		else
    			newArray[j]=studentIds[i];
    			j=j+1;
    	}
    	return newArray;	
    }
    
    
    public int groupsOfStudents(int[] studentIds) {
		int len = studentIds.length;
		int count = 0;
		for(int i=0; i<len-1;i++) {
			for(int j=i+1; j<len; j++) {
				if((studentIds[i]+studentIds[j])%2==0)
					count = count+1;
				
			}
		}
		return count;

    }
    public static void main(String[] args) {
    	// Unit testing
    	Course course = new Course(12);
    	
    	course.registerStudent(1);
    	course.registerStudent(2);
    	
    	int[] studentIds = course.getStudentIds();
    	for(int i=0; i < studentIds.length; i++) {
    		System.out.println(studentIds[i]);	
    	}
    	
    	course.setCourseId(10);
    	
    	course.setCredits(1);
    	course.getCredits();
    	
    	System.out.println(course.getCredits());
//    	
//    	course.setCourseName("Computer Science");
//    	System.out.println(course.getCourseName());
    	
  //  	course.setMaxCapacity(100);
    	
    	int[] studentArray = {1,2,3,4,5,6};
    	
    	System.out.println(course.groupsOfStudents(studentArray));
    	
//    	int[] newStudentArray = course.removeDuplicates(studentArray);
//    	for(int i=0; i < newStudentArray.length; i++) {
//    		System.out.println(newStudentArray[i]);	
//    	}
    	
    	
    	
    	
    }
}

