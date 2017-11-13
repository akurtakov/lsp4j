/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import java.util.Arrays;
import org.eclipse.lsp4j.debug.Source;
import org.eclipse.lsp4j.debug.SourceBreakpoint;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Arguments for 'setBreakpoints' request.
 */
@SuppressWarnings("all")
public class SetBreakpointsArguments {
  /**
   * The source location of the breakpoints; either source.path or source.reference must be specified.
   */
  private Source source;
  
  /**
   * The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  private SourceBreakpoint[] breakpoints;
  
  /**
   * Deprecated: The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  private Integer[] lines;
  
  /**
   * A value of true indicates that the underlying source has been modified which results in new breakpoint
   * locations.
   * <p>
   * This is an optional property.
   */
  private Boolean sourceModified;
  
  /**
   * The source location of the breakpoints; either source.path or source.reference must be specified.
   */
  @Pure
  public Source getSource() {
    return this.source;
  }
  
  /**
   * The source location of the breakpoints; either source.path or source.reference must be specified.
   */
  public void setSource(final Source source) {
    this.source = source;
  }
  
  /**
   * The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  @Pure
  public SourceBreakpoint[] getBreakpoints() {
    return this.breakpoints;
  }
  
  /**
   * The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  public void setBreakpoints(final SourceBreakpoint[] breakpoints) {
    this.breakpoints = breakpoints;
  }
  
  /**
   * Deprecated: The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Integer[] getLines() {
    return this.lines;
  }
  
  /**
   * Deprecated: The code locations of the breakpoints.
   * <p>
   * This is an optional property.
   */
  public void setLines(final Integer[] lines) {
    this.lines = lines;
  }
  
  /**
   * A value of true indicates that the underlying source has been modified which results in new breakpoint
   * locations.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Boolean getSourceModified() {
    return this.sourceModified;
  }
  
  /**
   * A value of true indicates that the underlying source has been modified which results in new breakpoint
   * locations.
   * <p>
   * This is an optional property.
   */
  public void setSourceModified(final Boolean sourceModified) {
    this.sourceModified = sourceModified;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("source", this.source);
    b.add("breakpoints", this.breakpoints);
    b.add("lines", this.lines);
    b.add("sourceModified", this.sourceModified);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SetBreakpointsArguments other = (SetBreakpointsArguments) obj;
    if (this.source == null) {
      if (other.source != null)
        return false;
    } else if (!this.source.equals(other.source))
      return false;
    if (this.breakpoints == null) {
      if (other.breakpoints != null)
        return false;
    } else if (!Arrays.deepEquals(this.breakpoints, other.breakpoints))
      return false;
    if (this.lines == null) {
      if (other.lines != null)
        return false;
    } else if (!Arrays.deepEquals(this.lines, other.lines))
      return false;
    if (this.sourceModified == null) {
      if (other.sourceModified != null)
        return false;
    } else if (!this.sourceModified.equals(other.sourceModified))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.source== null) ? 0 : this.source.hashCode());
    result = prime * result + ((this.breakpoints== null) ? 0 : Arrays.deepHashCode(this.breakpoints));
    result = prime * result + ((this.lines== null) ? 0 : Arrays.deepHashCode(this.lines));
    result = prime * result + ((this.sourceModified== null) ? 0 : this.sourceModified.hashCode());
    return result;
  }
}
