package com.github.khalaimovda.bankapp.accounts.model;

import java.math.BigDecimal;

public record Account (int id, int userId, BigDecimal amount) {}
