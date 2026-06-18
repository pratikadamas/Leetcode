class Solution {
    public double angleClock(int hour, int minutes) {
        // Calculate the position of the minute hand (6 degrees per minute)
        double minuteAngle = minutes * 6.0;
        
        // Calculate the position of the hour hand.
        // (hour % 12) converts 12:00 to 0 so it aligns with the top of the clock.
        // It moves 30 degrees per hour, plus 0.5 degrees for every minute passed.
        double hourAngle = (hour % 12) * 30.0 + minutes * 0.5;
        
        // Find the absolute difference between the two angles
        double diff = Math.abs(hourAngle - minuteAngle);
        
        // The smaller angle will either be the difference itself, 
        // or the remainder of the 360-degree circle
        return Math.min(diff, 360.0 - diff);
    }
}