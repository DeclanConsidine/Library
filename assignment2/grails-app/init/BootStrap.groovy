import com.assignment2.*
class BootStrap {

    def init = { servletContext ->
	
	def course1= new Course( title: 'English Language',
				code: 'ENG101',
				department: 'English',
				description: '''The English Language course comprises of over a thousand
				students that all work well.''',
				tutor: 'Hannah Monanah').save()
	
	def course2= new Course( title: 'Web Systems Design',
				 code: 'WSD101',
				 department: 'Computing',
				 description: '''The Web Systems Design course comprises of creating 
				websites which increses students skill with coding''',
				tutor: 'Tonderai Maswera').save()
	
	def course3= new Course( title: 'Computing',
				 code: 'COM101',
				department: 'Computing',
				description: '''The Computing course comprises of learning how to work 
				with all aspects of hardware with the inclusion of software too''',
				tutor: 'Martin Cooper').save()

	def student1= new Student(name: 'Keith Andrews',
				email: 'KeithAnd@gmail.com',
				studentid: 'KEI123',
				course: course3).save()

	def student2= new Student(name: 'Andy King',
				email: 'AndyKing@gmail.com',
				studentid: 'AND123',
				course: course2).save()
	
	def student3= new Student(name: 'Thomas Jeffcock',
				email: 'TomCock@gmail.com',
				studentid: 'TOM123',
				course: course1).save()

	def librarian1= new Librarian( name: 'Sandra Bullock',
					email: 'SandraB@gmail.com',
					userName: 'SanBull',
					password: 'password2',
					telephone: '0114232342').save()
	
	def librarian2= new Librarian( name: 'Romelu Lukaku',
					email: 'Romelu@gmail.com',
					userName: 'Romelu',
					password: 'Romelu',
					telephone: '0114534321').save()
	
	def librarian3= new Librarian( name: 'David Mitchell',
					email: 'DavidM@gmail.com',
					userName: 'DavidM',
					password: 'password2',
					telephone: '0114098765').save()

def book1= new Book( title: 'Destructor',
				author: 'Declan Considine',
				isbn: '13',
				dateBorrowed: new Date('19/01/2016'),
				returnDate: new Date('19/06/2016'),
				student: 'Thomas Jeffcock').save()
	
	def book2= new Book( title: 'The Princess Meets Vardy',
				author: 'Connor Woolley',
				isbn: '14',
				dateBorrowed: new Date('23/03/2016'),
				returnDate: new Date('23/07/2016'),
				student: 'Andy King').save()
	
	def book3= new Book(title: 'It Came From France',
				author: 'Reece Cope',
				isbn: '15',
				dateBorrowed: new Date('29/04/2016'),
				returnDate: new Date('29/08/2016'),
				student: 'Keith Andrews').save()

	

	def library1= new Library( location: 'Sheffield',
				openingHours: '7am').save()	
	
	def library2= new Library( location: 'Leicester',
				openingHours: '8am').save()
	
	def library3= new Library( location: 'Nottingham',
				openingHours: '9am').save()
	
	
					
		library1.addToLibrarians(librarian1)
		library2.addToLibrarians(librarian2)
		library3.addToLibrarians(librarian3)
		
		library1.addToBooks(book1)
		library2.addToBooks(book2)
		library3.addToBooks(book3)
		
		library1.addToStudents(student3)
		library2.addToStudents(student2)
		library3.addToStudents(student1)

		student1.addToBooks(book3)
		student2.addToBooks(book2)
		student3.addToBooks(book1)
		
		
    }
    def destroy = {
    }
}
