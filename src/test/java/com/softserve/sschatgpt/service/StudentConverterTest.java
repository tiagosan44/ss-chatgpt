package com.softserve.sschatgpt.service;

import com.softserve.sschatgpt.domain.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentConverterTest {

    private StudentConverter studentConverter;

    @BeforeEach
    public void setUp() {
        studentConverter = new StudentConverter();
    }

    @Test
    public void testHighAchiever() {
        Student student = new Student();
        student.setAge(21);
        student.setGrade(95);

        List<Student> convertedStudents = studentConverter.convertStudents(Arrays.asList(student));

        assertEquals(1, convertedStudents.size());
        assertTrue(convertedStudents.get(0).isHonorRoll());
    }

    @Test
    public void testExceptionalYoungHighAchiever() {
        Student student = new Student();
        student.setAge(20);
        student.setGrade(95);

        List<Student> convertedStudents = studentConverter.convertStudents(Arrays.asList(student));

        assertEquals(1, convertedStudents.size());
        assertTrue(convertedStudents.get(0).isExceptional());
    }

    @Test
    public void testPassedStudent() {
        Student student = new Student();
        student.setGrade(75);

        List<Student> convertedStudents = studentConverter.convertStudents(Arrays.asList(student));

        assertEquals(1, convertedStudents.size());
        assertTrue(convertedStudents.get(0).isPassed());
    }

    @Test
    public void testBorderlinePassedStudent() {
        Student student = new Student();
        student.setGrade(71);

        List<Student> convertedStudents = studentConverter.convertStudents(Arrays.asList(student));

        assertEquals(1, convertedStudents.size());
        assertTrue(convertedStudents.get(0).isPassed());
    }

    @Test
    public void testFailedStudent() {
        Student student = new Student();
        student.setGrade(65);

        List<Student> convertedStudents = studentConverter.convertStudents(Arrays.asList(student));

        assertEquals(1, convertedStudents.size());
        assertFalse(convertedStudents.get(0).isPassed());
    }

    @Test
    public void testBorderlineFailedStudent() {
        Student student = new Student();
        student.setGrade(70);

        List<Student> convertedStudents = studentConverter.convertStudents(Arrays.asList(student));

        assertEquals(1, convertedStudents.size());
        assertFalse(convertedStudents.get(0).isPassed());
    }

    @Test
    public void testEmptyArray() {
        List<Student> convertedStudents = studentConverter.convertStudents(Collections.emptyList());

        assertTrue(convertedStudents.isEmpty());
    }

    @Test
    public void testInputIsNull() {
        assertThrows(NullPointerException.class, () -> {
            studentConverter.convertStudents(null);
        });
    }
}