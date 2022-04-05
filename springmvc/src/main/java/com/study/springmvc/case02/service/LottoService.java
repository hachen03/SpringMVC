package com.study.springmvc.case02.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class LottoService {
      private List<Set<Integer>> lottos = new ArrayList<>();
      
      public List<Set<Integer>> getLottos(){
    	  return lottos;
      }
      public void addLotto() {
    	   lottos.add(generateLotto());
      }
      public void update(int index) {
    	  lottos.set(index, generateLotto());
      }
      public void deleteLotto(int index) {
    	  lottos.remove(index);
      }
      private Set<Integer> generateLotto(){
    	  Random r = new Random();
    	  //樂透539: 1~39取出不重複的5個號碼
    	  Set<Integer> lotto = new LinkedHashSet<Integer>();
    	  while(lotto.size()<5) {
    		  lotto.add(r.nextInt(39)+1);
    	  }
    	  return lotto;
      }
}
