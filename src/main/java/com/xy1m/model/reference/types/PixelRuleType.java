package com.xy1m.model.reference.types;

public enum PixelRuleType {
    UrlStartsWith,// - The rule enforces a match on the url prefix
    UrlDoesNotStartWith,// - The rule enforces a lack of match on the url prefix
    UrlEndsWith,// - The rule enforces a match the url suffix
    UrlDoesNotEndWith,// - The rule enforces a lack of match the url suffix
    UrlContains,// - The rule enforces a match on a substring of the url
    UrlDoesNotContain,// - The rule enforces a lack of match on a substring of the url
    UrlEquals,// - The rule enforces a match to the entire url
    UrlDoesNotEqual// - The rule enforces a lack of match on the url prefix
}
