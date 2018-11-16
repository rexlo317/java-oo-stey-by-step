package practice01;

import org.junit.Assert;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class Practice01Test {
    @Test
    public void should_person_have_name_and_age() throws Exception {
        Person person = new Person("Tom", 21);
        Assert.assertEquals(person.getName(),"Tom");
        Assert.assertEquals(person.getAge(), 21);
    }

    // 打开注释以继续
    @Test
    public void should_person_have_an_introduce_method_which_introduce_person_with_name_and_age() throws Exception {
        Person tom = new Person("Tom", 21);
        String introduce = tom.introduce();
        assertThat(introduce).isEqualTo("My name is Tom. I am 21 years old.");
    }
}
