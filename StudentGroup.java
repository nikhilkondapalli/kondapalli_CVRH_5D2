import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students.length!=0)
			return students;
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		
		
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		else if(students.length!=0)
			return students[index];
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		
		 if(index<0||index>=students.length||student==null)
			throw new IllegalArgumentException();
		 students[index]=student;
			
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		/*
		for(int i=students.length+1;i>0;i++)
		{
			students[i]=students[i-1];
		}
		
		students[0]=student;	
		
		 */ int n = (this.students == null) ? 0 : this.students.length;
		Student[] students = new Student[n+1];
		students[0] = student;
		for(int i = 1; i <=  n; i++){
			students[i] = this.students[i-1];
		}
		this.students = students;
		 
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		students[students.length+1]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index<0||index>=students.length||student==null)
			throw new IllegalArgumentException();
		
		
		for(int i=students.length;i>index;i++)
		{
			students[i]=students[i-1];
		}
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		
		for(int i=index;i< students.length-1;i++)
			students[i]=students[i+1];
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int k=0,c=0;
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				k=i;
				c=1;
				break;
			}
		}
		if(c==0)
			throw new IllegalArgumentException("Student not exists");
		else
		{
			for(int i=k;i<students.length-1;i++)
				students[i]=students[i+1];
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		for(int i=index+1;i<students.length;i++)
			students[i]=null;
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		int i,k=0;
		for(i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				k=i;
				break;
			}
		}
		for(i=k+1;i<students.length;i++)
			students[i]=null;
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		for(int i=0;i<index;i++)
			students[i]=null;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		int i,k=0;
		for(i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				k=i;
				break;
			}
		}
		for(i=0;i<k;i++)
			students[i]=null;
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		for(i=0;i<students.length;i++)
		{
			for(j=0;j<students.length;j++)
			{
				if(students[j].compareTo(students[j+1])!=1)
				{
					Student temp=students[j];
					students[j]=students[j+1];
					students[j+1]=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
