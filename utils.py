def format_time(time: float) -> str:
    order = 0
    while time < 1:
        time *= 1000
        order += 1
    return f"{time:.2f}{["", "m", "μ", "n", "p"][order]}s"
