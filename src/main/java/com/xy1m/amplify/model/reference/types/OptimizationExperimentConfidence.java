package com.xy1m.amplify.model.reference.types;

public enum OptimizationExperimentConfidence {
    NotEnoughData,// - Not enough data to calculate confidence
    Low,// - Low cofidence (p >= 0.1)
    Medium,// - High confidence (p < 0.1 and p >= 0.05)
    High,// - High confidence (p < 0.05)
    Undefined,// - Illegal data, impossible to calculate confidence
}
