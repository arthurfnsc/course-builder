//Rulesets http://codenarc.sourceforge.net/StarterRuleSet-AllRulesByCategory.groovy.txt

ruleset {
    description 'Rules Sample Groovy Gradle Project'

    ruleset "rulesets/basic.xml"
    ruleset("rulesets/braces.xml") {
        "IfStatementBraces" enabled: false
        "ElseBlockBraces" enabled: false
    }
    ruleset "rulesets/concurrency.xml"
    ruleset "rulesets/convention.xml"
    ruleset "rulesets/design.xml"
    ruleset "rulesets/dry.xml"
    ruleset "rulesets/enhanced.xml"
    ruleset "rulesets/exceptions.xml"
    ruleset("rulesets/formatting.xml") { "LineLength" length: 200 }
    ruleset "rulesets/generic.xml"
    ruleset "rulesets/grails.xml"
    ruleset "rulesets/groovyism.xml"
    ruleset "rulesets/imports.xml"
    ruleset "rulesets/junit.xml"
    ruleset("rulesets/logging.xml") {
        'Println' priority: 1
        'PrintStackTrace' priority: 1
    }
    ruleset "rulesets/naming.xml"
    ruleset "rulesets/security.xml"
    ruleset "rulesets/serialization.xml"
    ruleset "rulesets/size.xml"
    ruleset "rulesets/unnecessary.xml"
    ruleset "rulesets/unused.xml"
}
