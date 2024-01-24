## Student Grading System
Course Class Features:

Attributes: name, code, prefix, note, Teacher
Methods: Course() , addTeacher() , printTeacher()
Teacher Class Features:

Attributes: name, mpno, branch
Methods: Teacher()
Student Class Features:

Attributes: name,stuNo,classes,course1,course2,course3,avarage,isPass
Methods: Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
Homework
Enter the verbal grade section of the course into the Course class and indicate its effect on the average separately for each course. Include verbal grades with their percentage impact on the average.

Example: If the effect of the oral grade of the Physics course on the average is 20%, the effect of the exam grade is 80%.

If the student gets 90 in the oral exam and 60 in the exam, the effect of that course on the overall average is calculated as follows:

Physics Average: (90 * 0.20) + (60 * 0.80);
