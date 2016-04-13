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

	def librarian1= new Librarian( name: 'Sandra Bullock',
					email: 'SandraB@gmail.com',
					userName: 'SanBull',
					password: 'password2',
					telephone: '0114232342').save()
	
	def librarian2= new Librarian( name: 'Romelu Lukaku',
					email: 'Romelu@gmail.com',
					userName: 'Romelu',
					password: 'Romelu',
					telephone: 0114534321'.save()
	
	def librarian3= new Librarian( name: 'David Mitchell',
					email: 'DavidM@gmail.com',
					userName: 'DavidM',
					password: 'password2',
					telephone: '0114098765').save()

	def library1= new Library( location: 'Sheffield',
				openingHours: '7am',
				book: 'Horror',
				student: 'Keith Andrews',
				librarian: 'Sandra Bullock').save()	
	
	def library2= new Library( location: 'Leicester',
				openingHours: '8am',
				book: 'Romance',
				student: 'Andy King',
				librarian: 'Romelu Lukaku').save()
	
	def library3= new Library( location: 'Nottingham',
				openingHours: '9am',
				book: 'Sci-Fi',
				student: 'Thomas Jeffcock',
				librarian: 'David Mitchell').save()
	
	def book1= new book( title: 'Destructor',
				author: 'Declan Considine',
				isbn: '13',
				dateBorrowed: new Date('19/01/2016'),
				returnDate: new Date('19/06/2016'),
				student: 'Thomas Jeffcock').save()
	
	def book2= new book( title: 'The Princess Meets Vardy',
				author: 'Connor Woolley',
				isbn: '14',
				dateBorrowed: new Date('23/03/2016'),
				returnDate: new Date('23/07/2016'),
				student: 'Andy King').save()
	
	def book3= new book(title: 'It Came From France',
				author: 'Reece Cope',
				isbn: '15',
				dateBorrowed: new Date('29/04/2016'),
				returnDate: new Date('29/08/2016'),
				student: 'Keith Andrews').save()
					
	def student1= new student(name: 'Keith Andrews',
				email: 'KeithAnd@gmail.com',
				studentid: 'KEI123',
				course: 'Computing').save()

	def student2= new student(name: 'Andy King',
				email: 'AndyKing@gmail.com',
				studentid: 'AND123',
				course: 'Web Systems Design').save()
	
	def student3= new student(name: 'Thomas Jeffcock',
				email: 'TomCock@gmail.com',
				studentid: 'TOM123',
				course: 'English Language').save()
			
    }
    def destroy = {
    }
}
