package io.github.englishwithpatricia007.todolist.utils;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {

  public static void copyNonNullProperties(Object source, Object target) {
    BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
  }

  public static String[] getNullPropertyNames(Object source) {

    if (source == null) {
      return new String[0];
    }

    BeanWrapper src = new BeanWrapperImpl(source);

    Set<String> emptyNames = new HashSet<>();

    for (PropertyDescriptor pd : src.getPropertyDescriptors()) {
      if (src.getPropertyValue(pd.getName()) == null) {
        emptyNames.add(pd.getName());
      }
    }

    return emptyNames.toArray(new String[0]);
  }

}
