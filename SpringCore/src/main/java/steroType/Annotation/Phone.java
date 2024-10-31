package steroType.Annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	@Value("#{temp}")
private List<String> list;

public List<String> getList() {
	return list;
}

public void setList(List<String> list) {
	this.list = list;
}

public Phone(List<String> list) {
	super();
	this.list = list;
}

public Phone() {
	super();
}

@Override
public String toString() {
	return "Phone [list=" + list + "]";
}




}
