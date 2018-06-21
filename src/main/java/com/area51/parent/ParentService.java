package com.area51.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ParentService {
    @Autowired
    private ParentRepository parentRepo;


	/*private List<Course> topics = new ArrayList<>(Arrays.asList(
			new Course("001","Spring","This is spring"),
			new Course("002","Summer","This is summner"),
			new Course("003","Autumn","This is autumn"),
			new Course("004","Winter","This is winter")
			));*/

    public List<Parent> getAllParent(){
        //return topics;
        List<Parent> courses = new ArrayList<>();

        parentRepo.findAll().forEach(courses::add);
		/*for (Course course : courses) {
			if(course.getTopic().getId() != topicId)
				courses.remove(course);
		}*/
        return courses;
    }

    public Optional<Parent> getParent(int id) {
        //return topics.stream().filter(t -> t.getName().equals(id)).findFirst().get();
        return parentRepo.findById(id);
    }

    public void addParent(Parent parent){
        //topics.add(topic);
        parentRepo.save(parent);
    }

    public void updateCourse(String id, Parent parent) {
		/*for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getName().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/

        parentRepo.save(parent);
    }

    public String deleteParent(int id) {
        //topics.removeIf(t->t.getName().equals(id));
		/*System.out.println(id);
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getName().equals(id)) {
				topics.remove(i);
				return "Deleted";
			}

		}
		return "Not deleted";*/

        parentRepo.deleteById(id);
        return "success";
    }
}
