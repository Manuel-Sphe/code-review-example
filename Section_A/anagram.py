class Solution:
    def groupAnagrams(self, strs):
        # create a dictionary to store the anagrams
        result = {}
        # loop through each string in the list
        for i in strs:
            # sort each word and use it as the key in the dictionary
            x = "".join(sorted(i))
            if x in result:
                result[x].append(i)
            else :
                result[x] = [i]
        # return the values of the dictionary as a list of lists
        return list(result.values())
ob1 = Solution()
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
