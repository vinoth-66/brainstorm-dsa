class Solution {
public:
    string defangIPaddr(string address) {
        string str=regex_replace(address,regex("\\."),"[.]");
        return str;
    }
};