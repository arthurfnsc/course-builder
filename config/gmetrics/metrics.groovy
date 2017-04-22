//final COBERTURA_FILE = 'coverage/GMetrics/coverage.xml'

metricset {

    ABC {functions = [
            'average',
            'minimum',
            'maximum',
            'total'
        ]}

    AfferentCoupling { functions = [
            'average',
            'minimum',
            'maximum',
            'total']
    }

    ClassCount { functions = [
            'average',
            'minimum',
            'maximum',
            'total']
    }

    ClassLineCount { functions = [
            'average',
            'minimum',
            'maximum',
            'total']
    }

    //CoberturaBranchCoverageMetric

    //CoberturaLineCoverageMetric

    //def coberturaMetric = CoberturaLineCoverage {
        //coberturaFile = COBERTURA_FILE
        //functions = ['total']
    //}

    //CRAP {
        //functions = ['total']
        //coverageMetric = coberturaMetric
    //}

    CyclomaticComplexity { functions = [
            'average',
            'minimum',
            'maximum',
            'total'
        ]}

    EfferentCoupling { functions = [
            'average',
            'minimum',
            'maximum',
            'total']
    }

    FieldCount { functions = [
            'average',
            'minimum',
            'maximum',
            'total']
    }

    MethodLineCount { functions = [
            'average',
            'minimum',
            'maximum',
            'total'
        ]}

    MethodCount { functions = [
            'average',
            'minimum',
            'maximum',
            'total']
    }
}