from collections import defaultdict
from typing import List

class Solution:
    def grouAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = defaultdict(list)
        for s in strs:
            count = [0] * 26 #creates a list from 0 to 25, 26 indexes
            for c in s:
                count[ord(c) - ord('a')] += 1
            key = tuple(count)
            anagram_dict[key].append(s)

        return list(anagram_dict.values())