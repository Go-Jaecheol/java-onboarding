package onboarding;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        Map<String, Set<String>> overlapMap = new HashMap<>();

        for (List<String> form : forms) {
            String email = form.get(0);
            String nickname = form.get(1);
            addSubStringOfNickname(email, nickname, overlapMap);
        }
        return answer;
    }

    private static void addSubStringOfNickname(String email, String nickname, Map<String, Set<String>> overlapMap) {
        for (int i = 0; i < nickname.length() - 1; i++) {
            String subNickname = nickname.substring(i, i + 2);
            addSubNicknameToMap(email, subNickname, overlapMap);
        }
    }

    private static void addSubNicknameToMap(String email, String subNickname, Map<String, Set<String>> overlapMap) {
        if (!overlapMap.containsKey(subNickname)) {
            overlapMap.put(subNickname, new HashSet<>());
        }
        overlapMap.get(subNickname).add(email);
    }
}
