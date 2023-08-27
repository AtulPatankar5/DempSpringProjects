package com.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.course.dao.CourseDao;
import com.course.entities.Course;

@Service // Contains @Component
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
//	List<Course> list;

	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(113, "Java", "Learn in 30 days "));
//		list.add(new Course(114, "C", "Learn in 15 days "));
//		list.add(new Course(115, "C++", "Learn in 20 days "));

	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
//		Course c = null;
//		for (Course cor : list) {
//			if (cor.getId() == courseId) {
//				c = cor;
//				break;
//			}
//		}

		return courseDao.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {

//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;

		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(long parseLong) {
//		list = list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
		courseDao.deleteById(parseLong);
	}

}
