#pragma once

/* VERB_TOKEN : 동사인지, 검사하고 변경합니다. */
string VERB_TOKEN(string line) {
    regex pattern("\"([^\"]*)\"|'([^']*)'|해줘|하고|해주고|주고");
    smatch matches;
    string result;

    auto it = line.cbegin();

    while (regex_search(it, line.cend(), matches, pattern)) {
        const string match = matches[0];
        result += matches.prefix();

        if (match == "해줘" || match == "하고" || match == "해주고" || match == "주고")
            result += "<-verb->";
        else
            result += matches[0];

        it = matches[0].second;
    }

    result += string(it, line.cend());
    return result;
}